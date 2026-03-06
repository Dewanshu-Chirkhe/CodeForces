#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr;

    while (n > 0) {
        arr.push_back(n % 10);
        n /= 10;
    }
    reverse(arr.begin(), arr.end());

    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] != 1 && arr[i] != 4) {
            cout << "NO" << endl;
            return 0;
        }
        if (arr[i] == 4) {
            if (i - 1 < 0 || arr[i - 1] != 1) {
                if (i - 2 < 0 || arr[i - 2] != 1 || arr[i - 1] != 4) {
                    cout << "NO" << endl;
                    return 0;
                }
            }
        }
    }

    cout << "YES" << endl;
    return 0;
}
