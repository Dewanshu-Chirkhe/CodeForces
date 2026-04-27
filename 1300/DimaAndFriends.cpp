#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        sum += num;
    }
    int count = 0;
    for (int x = 1; x <= 5; x++) {
        if ((sum + x) % (n + 1) != 1) count++;
    }
    cout << count << endl;
    return 0;
}
