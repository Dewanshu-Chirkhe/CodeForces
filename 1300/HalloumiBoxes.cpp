#include<bits/stdc++.h>
using namespace std;

bool isSorted(vector<int>& arr){
    int n = arr.size();
    for(int i=1 ; i<n ; i++){
        if(arr[i] < arr[i-1]) return false;
    }
    return true;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n , k;
        cin >> n >> k;
        vector<int> arr(n , 0);
        for(int i=0 ; i<n ; i++){
            cin >> arr[i];
        }
        if(k > 1) {
            cout << "YES" << endl;
        }
        if(k == 1){
            if(isSorted(arr)) cout << "YES" << endl;
            else cout << "NO" << endl;
        }
    }
    return 0;
}