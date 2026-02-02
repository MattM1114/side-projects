#include <iostream>
#include <string>

using namespace std;

int main() {
  // here I am amking a string that will get the users password and nest I will
  // make to bools for uppercase and digts
  string pass;
  string schar = "!@~#$%^&*()+-_/:;'\"}{|~`:<>?";

  bool Upper = false, Digit = false, lower = false, special = false;

  cout << "Enter your password" << endl;
  cin >> pass;

  if (pass.length() < 8) {
    cout << "password is weak" << endl;
    return 0;
  }

  for (char c : pass) {
    if (c >= 'A' && c <= 'Z') {
      Upper = true;
    }
    else if (c >= '0' && c <= '9' )
    {
        Digit = true;
    } else if (c >= 'a' && c <= 'z') {
      lower = true;}
  else if ((c >= '@' && c <= '/') || (c >= ':' && c <= '~')) {
    special = true;
  }
}

    if (Upper && Digit && special) {
        cout << "password is strong" << endl;
    } else {
       cout << "Medium password " << endl;
    }
  
  return 0;
}