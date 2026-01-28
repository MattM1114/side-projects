#include <iostream>
using namespace std;

int main() {
  int choice;
  double balance = 1000.0, amount;

  while (true)
  {
    /* this is a simple atm */
    cout << "--atm menu --" << endl;
    cout << "1. check balance" << endl;
    cout << "2. deposit money" << endl;
    cout << "3. withdraw money" << endl;
    cout << "4 exit" << endl;

    cin >> choice;

    if (choice == 1)
    {
        cout << "your current balance is: " << balance << endl;
    } else if (choice == 2)
    {
        cout << " How much would you like to deposit? ";
        cin >> amount;
        balance += amount;
        cout << "amout deposited successfully" << endl;
    } else if (choice == 3)
    {
        cout << "How much would you like to withdraw?"<<endl;
        cin >> amount;
        if (amount > balance)
        {
            cout <<"Insufficient funds"<<endl;
        }
        else
        {
          balance -= amount;
          cout << "withdrawal successful" << endl;

        }
    } else if (choice == 4) {
      cout << "thank you for using our services." << endl;
      break; // exit the program

    } else {
       cout <<"Invalid choice"<<endl;
    }
    
    


    return 0;
  }
  
}