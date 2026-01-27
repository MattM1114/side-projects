#include <iostream>
using namespace std;

int main(){
    int secret_number = 7;
    int user_guess;
    int number_of_attempts = 0;

    do
    {
            cout << "Guess the secret number (between 1 and 10): " << endl;
    cin >> user_guess;
    number_of_attempts += 1;
    if (user_guess < secret_number){
        cout << "Two low, try again." << endl;
    }
    else if (user_guess > secret_number) {
        cout << "Too high, try again." << endl;
    }
    else{
        cout << "congratulations! you got the number in " << number_of_attempts << " attempts." << endl;
    }
    } while (user_guess != secret_number);
    return 0;
}