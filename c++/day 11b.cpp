#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "how many numbers ? ";
    cin >> n;

    int nums[n];

    for (int i = 0; i < n; i++){
        cin >> nums[i];
    }

    cout << "\nthe numbers in reverse order are : "<<endl;
    for (int i = n-1; i >= 0; i--)
    {
        cout << nums[i] <<" ";
    }
    
    return 0;

}
