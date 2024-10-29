package com.example.acces;

public class AccessTest {

	public static void main(String[] args) {
		PublicClass pb = new PublicClass();
		pb.showPublicMessage();
		
		PackagePrivateClass pv = new PackagePrivateClass();
		pv.showPackagePrivateMessage();

	}

}
