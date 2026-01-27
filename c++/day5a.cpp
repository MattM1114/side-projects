#include <iostream>
#include <string>
using namespace std;

int main(){
    string login_name = "Matt";
    string login_password = "M1234";
    // Prompt the user to enter their name and password
    cout << "enter your name to login : " << endl;
    string user_name;
    cin >> user_name;
    cout << "enter your password to login : " << endl;
    string user_password;
    cin >> user_password;
    // Check if the entered name and password match the stored credentials
    if(user_name == login_name &&  user_password == login_password){
        cout << "welcome " << user_name << endl;
    } else {
        cout << "invaild login" << endl;}
    return 0;
}