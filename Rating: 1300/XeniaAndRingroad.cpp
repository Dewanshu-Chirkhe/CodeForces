#include <bits/stdc++.h>
using namespace std;

int main() {
    long long n, m;
    cin >> n >> m;
    
    vector<long long> a(m);
    for(long long i = 0; i < m; i++) {
        cin >> a[i];
    }

    long long time = 0;
    long long current = 1;  

    for(long long i = 0; i < m; i++) {
        if(a[i] >= current) {
            time += a[i] - current;
        } else {
            time += n - (current - a[i]);
        }
        current = a[i];
    }

    cout << time << "\n";
    return 0;
}
