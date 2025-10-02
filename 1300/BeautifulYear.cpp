#include<bits/stdc++.h>
using namespace std;

bool isDistinct(int year){
    set<int> set;
    while(year != 0){
        int num = year % 10;
        year /= 10;
        if(set.count(num)) return false;
        else set.insert(num);
    }
    return true;
}

int main(){
    int year;
    cin >> year;
    year++;
    while(true){
        if(isDistinct(year)){
            cout << year << endl;
            break;
        }
        year++;
    }
    return 0;
}