#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i=0 ; i<n ; i++) cin >> arr[i];

    unordered_map<int,int> firstPos, lastPos;
    for(int i=0; i<n; i++){
        if(!firstPos.count(arr[i])) firstPos[arr[i]] = i+1;
        lastPos[arr[i]] = n-i;
    }

    int m;
    cin >> m;
    long long front = 0, back = 0;

    for(int i=0; i<m; i++){
        int num;
        cin >> num;
        front += firstPos[num];
        back += lastPos[num];
    }

    cout << front << " " << back << endl;
    return 0;
}
