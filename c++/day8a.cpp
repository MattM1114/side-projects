#include <iostream>
using namespace std;

int main() {
    int n;
    double num, sum = 0;

    cout << "how many numbers?" << endl;
    cin >> n;

    for (int i = 0; i < n; i++) {
      cout << "enter the number" << endl;
      cin >> num;
      sum +=num;
    }
    double avg = sum / n;

    cout << "the sum is " << sum << endl;
    cout << "the average is " << avg << endl;
    
    return 0;
    
}