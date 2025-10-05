#include <bits/stdc++.h>
using namespace std;

int main() {
    long long num;
    cin >> num;

    int luckyCount = 0;
    while (num > 0) {
        int last = num % 10;
        if (last == 4 || last == 7) {
            luckyCount++;
        }
        num /= 10;
    }

    if (luckyCount == 0) {
        cout << "NO" << endl;
        return 0;
    }

    int temp = luckyCount;
    while (temp > 0) {
        int d = temp % 10;
        if (d != 4 && d != 7) {
            cout << "NO" << endl;
            return 0;
        }
        temp /= 10;
    }

    cout << "YES" << endl;
    return 0;
}
