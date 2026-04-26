#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        bool possible = false; 
        int minELe = INT_MAX;
        vector<int> arr(n);
        for(int i=0 ; i<n ; i++){
            cin >> arr[i];
            minELe = min(minELe, arr[i]);
        }
        if(arr[0] == minELe) possible = true;
        cout << (possible ? "YES" : "NO") << endl;
    }
    return 0;
}