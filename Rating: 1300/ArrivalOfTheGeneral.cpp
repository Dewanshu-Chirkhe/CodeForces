#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> soldier(n , 0);
    int high = INT_MIN , low = INT_MAX;
    int highIdx = - 1 , lowIdx = -1;
    for(int i=0 ; i<n ; i++){
        cin >> soldier[i];
        if(soldier[i] > high){
            high = soldier[i];
            highIdx = i;
        }
        if(soldier[i] <= low){
            low = soldier[i];
            lowIdx = i;
        }
    }
    int ans;
    if(highIdx < lowIdx) ans = highIdx + (n - lowIdx - 1);
    else ans = highIdx + (n - lowIdx - 2);
    cout << ans << endl;
    return 0;
}