// Implementation of Linear search in C++

#include<iostream>
#include<bits/stdc++.h>

using namespace std;
int search(vector<int> &arr,int key,int n){
	int test = -1;
	for(int i=0;i<n;i++){
		if(arr[i] == key)
			test = i;
	}
	return test;
}

int main(){
	int n;
	cout<< "Please enter the number of elements: " << endl;
	cin>> n;
	vector<int> arr;
	cout<< "Please enter the elements: " << endl;
	int p;
	for(int i=0;i<n;i++){
		cin>>p;
		arr.push_back(p); 
	}
	int key;
	cout<< "Enter the element to be searched(key): " << endl;
	cin>> key;
	int test = search(arr,key,n);
	if(test != -1)
		cout<< "Key found at index: " << test << endl;
	else
		cout<< "Key not found!" << endl;
	return 0;
}