import csv
from collections import defaultdict

def extract(filepath):
    with open(filepath, newline="")as f:
        reader = csv.reader(f)
        return list(reader)


def transform(records):
    clean_records = []
    
    for row in records:
        try:
            amount = float(row["amount"])
        except ValueError:
            print(f"invaild row {row}")
            continue
        clean_records.append({
            "Order_id": int(row["order_id"]),
            "customer": row["customer"].strip(),
            "amount": amount,
            "region": row["region"].strip()
        })
    return clean_records

def aggregate(records):
    customers = defaultdict(list)
    region_totals = defaultdict(float)
    for row in records:
        customers[row["customer"]] +=row["amount"]
        region_totals[row["region"]] +=row["amount"]
    return customers, region_totals


def export_summary(customers, region_totals):
    with open ("summary.csv", "w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["Customer","Total"])
        writer.writerow(["customer","Total Sales"])
        for customer, total in customers.items():
            writer.writerow([customer,total])
            
        writer.writerow([])
        writer.writerow(["Region Totals"])
        writer.writerow(["Region","Total Sales"])
        for region, total in region_totals.items():
            writer.writerow([region,total])


def main():
    records = extract("sales.csv")
    clean_records = transform(records)
    customer_totals, region_totals = aggregate(clean_records)
    export_summary(customer_totals, region_totals)

    print("Pipeline completed successfully.")

if __name__ == "__main__":
    main()

