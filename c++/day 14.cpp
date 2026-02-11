#include <iostream>
#include <string>
using namespace std;

const int MAX = 100;

void addContact(string name[], string number[], int &count) {
    if (count >= MAX) {
        cout << "The contact list is full. \n";
        return;
    }

    cout << "enter  name: ";
    cin >> name[count];
    cout << "enter phone: ";
    cin >> number[count];
    count++;
    cout <<"Contact added.\n";
}

void viewContacts(string name[], string number[], int count) {
    if (count == 0) {
        cout << "The contact list is empty. \n";
    }
    for (int i=0; i<count; i++) {
        cout<< i + 1 <<". "<<name[i]<<": "<<number[i]<<endl;

    }
}

void searchContact(string name[], string number[], int count) {
    string target;
    cout << "Enter the your contacts name";
    cin >> target;
    for (int i = 0; i < count; i++) {
        if (name[i] == target) {
            cout << i + 1 << "." << target << ": " << number[i] << endl;
            return;
        }
    }
    cout << "Contact not found.\n";
}

int main() {
    string names[MAX];
    string numbers[MAX];
    int count = 0;
    int choice;

    do {
        cout << "\nMenu:\n";
        cout << "1. Add a contact\n2. View contacts \n3 Search for a "
                "contact\n4. Exit\n";
        cin >> choice;

        switch (choice) {
            case 1:
                addContact(names, numbers, count);
                break;
            case 2:
                viewContacts(names, numbers, count);
                break;
            case 3:
                searchContact(names, numbers, count);
                break;
            case 4:
                cout << "Exiting the program.\n";
                break;
            default:
                cout << "Invalid choice\n";
            }
    } while (choice != 4);
    return 0;
    
}