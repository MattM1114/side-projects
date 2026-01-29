#include <iostream>
using namespace std;

int main() {
  int n; // this wil be used for the user to enter the nuber they want the
         // factorial of to
  long long fact = 1; // this will be used to store the value of the factorial
  cout << "pleas enter a number" << endl;
  cin >> n;

  cout <<"the factorials of "<< n << " is :"<< endl;
  for (int i = 1; i <= n; i++) {
    cout <<fact*i<<endl;
  }

  return 0;
}