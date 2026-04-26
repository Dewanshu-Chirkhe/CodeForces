#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int zeros = 0, fives = 0;
    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        if (num == 0) zeros++;
        else fives++;
    }

    if (zeros == 0) {
        cout << "-1\n";
        return 0;
    }

    int useFives = (fives / 9) * 9;

    if (useFives == 0) {
        cout << "0\n";
        return 0;
    }

    string ans(useFives, '5');  
    ans.append(zeros, '0');    

    cout << ans << endl;
    return 0;
}
