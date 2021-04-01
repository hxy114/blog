#include<algorithm>
#include<vector>
#include<iostream>
using namespace std;
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int  f1[100], f2[100], f3[100];
        f1[0] = 0 - prices.size();
        f2[0] = 0;
        f3[0] = 0;
        for (int i = 1; i < prices.size(); i++) {
            f1[i] = max(f1[i - 1], f3[i - 1] - prices[i]);
            f2[i] = f1[i - 1] + prices[i];
            f3[i] = max(f3[i - 1], f2[i - 1]);
        }
        for (int i = 0; i < prices.size(); i++) {
            cout << f1[i] << " ";
        }
        cout << endl;
        for (int i = 0; i < prices.size(); i++) {
            cout << f2[i] << " ";
        }
        cout << endl;
        for (int i = 0; i < prices.size(); i++) {
            cout << f3[i] << " ";
        }
        cout << endl;
        return max(max(f2[prices.size() - 1], f3[prices.size() - 1]), 0);
    }
};
int main() {
    Solution s;
    vector<int>v{ 1,2,3,0,2 };
    s.maxProfit(v);
}