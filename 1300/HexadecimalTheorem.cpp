#include <bits/stdc++.h>
using namespace std;

int main() {
    long long n;
    cin >> n;
    
    vector<long long> fib = {0, 1};
    while (fib.back() < n)
        fib.push_back(fib[fib.size()-1] + fib[fib.size()-2]);

    // Find the index of n in Fibonacci sequence
    int idx = find(fib.begin(), fib.end(), n) - fib.begin();

    if (idx < 3) {
        // Handle small n manually
        if (n == 0) cout << "0 0 0\n";
        else if (n == 1) cout << "1 0 0\n";
        else cout << "1 1 0\n";
    } else {
        cout << fib[idx-3] << " " << fib[idx-2] << " " << fib[idx-1] << "\n";
    }
    return 0;
}
