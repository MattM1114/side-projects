#include <iostream>
using namespace std;

// we will be using a if  else statement to check if a number is a  even or odd

int main() {
    //num is for storing the user input as an number
    int num, i =0,even =0,odd =0;
    
    while (i < 5)
    {
            cout << "Enter an integer: " << endl;
            cin >> num;
        if (num % 2 == 0) {
            cout << num << " is an even number." << endl;
            even +=1;
        } else {
            cout << num << " is an odd number." << endl;
            odd +=1;
        }
        i += 1;
    }
    cout << "Total even numbers: " << even <<" out of 5" << endl;
    cout << "Total odd numbers: " << odd <<" out of 5"<< endl;

    return 0;
}