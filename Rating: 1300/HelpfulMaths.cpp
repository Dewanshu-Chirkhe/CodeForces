#include<bits/stdc++.h>
using namespace std;

int main(){
    string str , ans;
    cin >> str;
    priority_queue<int , vector<int> , greater<int>> pq;
    for(int i=0 ; i<str.size() ; i++){
        char ch = str[i];
        if(ch == '+') continue;
        else pq.push(ch - '0');
    }
    while(!pq.empty()){
        ans += (char)(pq.top() + '0');
        pq.pop();
        ans += '+';
    }
    ans = ans.substr(0 , ans.size() - 1);
    cout << ans << endl;
    return 0;
}