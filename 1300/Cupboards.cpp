#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int leftOpen = 0, rightOpen = 0;

    for (int i = 0; i < n; i++) {
        int l, r;
        cin >> l >> r;
        if (l == 1) leftOpen++;
        if (r == 1) rightOpen++;
    }

    int ans = min(leftOpen, n - leftOpen) + min(rightOpen, n - rightOpen);
    cout << ans << endl;
    return 0;
}
