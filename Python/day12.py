import string

# 1. Individual Rule Functions (Updated to return Status, Message)
def has_min_len(password):
    return len(password) >= 8, "At least 8 characters"

def has_upper(password):
    # Fixed .isupper() case
    return any(c.isupper() for c in password), "Uppercase letter"

def has_lower(password):
    # Fixed .islower() case
    return any(c.islower() for c in password), "Lowercase letter"

def has_num(password):
    return any(c.isdigit() for c in password), "A number"

def has_special(password):
    return any(c in string.punctuation for c in password), "Special character"

def has_nospaces(password):
    return " " not in password, "No spaces"

# 2. Analysis Logic
rules = [has_min_len, has_upper, has_lower, has_num, has_special, has_nospaces]

def analyze_password(password):
    issues = []
    score = 0
    
    for rule in rules:
        passed, message = rule(password)
        if passed:
            score += 1
        else:
            issues.append(message)
    
    # Adjusted strength thresholds for 6 rules
    if score <= 2:
        strength = "Weak"
    elif score <= 4:
        strength = "Medium"
    else:
        strength = "Strong"
    
    return {
        "score": score,
        "strength": strength,
        "max_score": len(rules),
        "issues": issues
    }

# 3. Execution
def main():
    password = input("Enter a password to test: ")
    result = analyze_password(password)
    
    print(f"\n--- Results ---")
    print(f"Strength: {result['strength']}")
    print(f"Score:    {result['score']}/{result['max_score']}")
    
    if result['issues']:
        print("Missing Requirements:")
        for issue in result["issues"]:
            print(f"  [ ] {issue}")
    else:
        print("✅ Excellent! This is a very secure password.")

if __name__ == "__main__":
    main()