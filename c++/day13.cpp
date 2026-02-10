#include <iostream>
#include <string>
using namespace std;

// Renamed for clarity and fixed spelling
bool isValidName(string u) {
    if (u.length() < 5) return false;
    for (char c : u) {
        if (c == ' ') return false;
    }
    return true;
}

bool isValidPassword(string p) {
    if (p.length() < 8) return false;

    bool hasUpper = false;
    bool hasDigit = false;

    for (char c : p) {
        if (c >= 'A' && c <= 'Z') hasUpper = true;
        if (c >= '0' && c <= '9') hasDigit = true;
        // The return was moved out of here!
    }

    // Now we check if both conditions were met after looking at every character
    return hasUpper && hasDigit;
}

int main() {
    string name;
    string password;

    cout << "Enter your username (min 5 chars, no spaces): ";
    // Use cin >> name if you don't want to allow spaces at all
    cin >> name; 

    cout << "Enter your password (min 8 chars, 1 uppercase, 1 digit): ";
    cin >> password;

    if (isValidName(name) && isValidPassword(password)) {
        cout << "Access granted" << endl;
    } else {
        cout << "Access denied" << endl;
    }

    return 0;
}