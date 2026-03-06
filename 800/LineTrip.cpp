#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, x;
        cin >> n >> x;
        vector<int> pump(n, 0);
        int maxDist = 0;
        int prev = 0;
        for(int i=0 ; i<n ; i++){
            cin >> pump[i];
            int dist = pump[i] - prev;
            maxDist = max(maxDist, dist);
            prev = pump[i];
        }
        maxDist = max(maxDist, 2 * (x - prev));
        cout << maxDist << endl;
    }
}