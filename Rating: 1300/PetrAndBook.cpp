#include<bits/stdc++.h>
using namespace std;

int main(){
    int pages;
    cin >> pages;
    vector<int> days(7);
    int sum = 0;
    for(int i=0 ; i<7 ; i++){
        cin >> days[i];
        sum += days[i];
    }

    if(pages > sum) pages %= sum;
    if (pages == 0) pages = sum;

    for(int i=0 ; i<7 ; i++){
        pages -= days[i];
        if(pages <=0){
            cout << i+1 << endl;
            return 0;
        }
    }
}