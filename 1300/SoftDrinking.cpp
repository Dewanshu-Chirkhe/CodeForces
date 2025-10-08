#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, k, l, c, d, p, nl, np;
    cin >> n >> k >> l >> c >> d >> p >> nl >> np;

    int drink = (k * l) / nl;
    int limes = c * d;
    int salt = p / np;

    int ans = min(drink , min(limes , salt));
    cout << ans/n << endl;
    return 0;
}