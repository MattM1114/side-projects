#include <iostream>
using namespace std;

int main() {
    int num1,num2,num3;

    cout << "Enter the first number: " << endl;
    cin >> num1;
    cout << "enter the second number: " << endl;
    cin >> num2;
    cout << "do you want to (1)add , (2)subtract , (3)multiply or (4)divide? " << endl;
    int op;
    cin >> op;

    switch (op)
    {
    case 1:
        num3 = num1 + num2;
        break;
    case 2:
        num3 = num1 - num2;
        break;
    case 3:
        num3 = num1 * num2;
        break;
    case 4:
        if (num2 != 0) {
            num3 = num1 / num2;
        } else {
            cout << "Error: Division by zero is not allowed."<< endl;
        }
        break;
    }
    cout << "The result is: " << num3 << endl;
    return 0;
}
