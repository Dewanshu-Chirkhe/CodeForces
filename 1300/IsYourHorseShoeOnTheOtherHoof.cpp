#include<bits/stdc++.h>
using namespace std;

int main(){
    int m , n , o , p;
    set<int> st;
    int ans = 0;
    for(int i=0 ; i<4 ; i++){
        int shoe = 0;
        cin >> shoe;
        if(st.count(shoe)) ans++;
        else st.insert(shoe);
    }
    cout << ans << endl;
    return 0;
}