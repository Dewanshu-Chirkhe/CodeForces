#include<bits/stdc++.h>
using namespace std;

int main(){
    string guest , host , pile;
    cin >> guest >> host >> pile;

    string concat = guest + host;
    sort(concat.begin() , concat.end());
    sort(pile.begin() , pile.end());

    if(concat == pile) cout << "YES" << endl;
    else cout << "NO" << endl;
    return 0;
}