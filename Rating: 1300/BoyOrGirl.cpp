#include<bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin >> str;
    set<char> st;
    for(int i=0 ; i<str.size() ; i++){
        char ch = str[i];
        st.insert(ch);
    }
    if(st.size() % 2 != 0) cout << "IGNORE HIM!" << endl;
    else cout << "CHAT WITH HER!" << endl;
    return 0;
}