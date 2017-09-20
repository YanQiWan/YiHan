package com.example.college.Internetconnection;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import Commonality.CFile;
import Commonality.TransportObject;
import Commonality.User;
import Commonality.UserComment;

public class InternetConnection {
	public InternetConnection()
	{};
	public User MessageTransmit(Object obj)
	{
	    try 
	    {
	    	Socket socket = new Socket("101.200.38.1",9999); //IP：101.200.38.1,9999
	    	//向服务器发送消息 
	    	ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(new TransportObject(1, obj));
			ObjectInputStream in=new ObjectInputStream(socket.getInputStream());	
            User login_user=(User)in.readObject();
		    //关闭流 
	    	out.close(); in.close(); 
	    	//关闭Socket 
		    socket.close();  
		    return login_user;
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	public ArrayList<CFile> CFileTransmit(Object obj)
	{
		try 
	    {
	    	Socket socket = new Socket("101.200.38.1",9999); //IP：101.200.38.1,9999
	    	//向服务器发送消息 
	    	ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(new TransportObject(2, obj));
			ObjectInputStream in=new ObjectInputStream(socket.getInputStream());	
			@SuppressWarnings("unchecked")
			ArrayList<CFile> cfile=(ArrayList<CFile>)in.readObject();
			System.out.println("ddddddddddddddddddddddd\n\n\n"+cfile.size());
		    //关闭流 
	    	out.close(); in.close(); 
	    	//关闭Socket 
		    socket.close();  
		    return cfile;
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	public ArrayList<UserComment> UserCommentTransmit(Object obj)
	{
		try 
	    {
	    	Socket socket = new Socket("101.200.38.1",9999); //IP：101.200.38.1,9999
	    	//向服务器发送消息 
	    	ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(new TransportObject(3, obj));
			ObjectInputStream in=new ObjectInputStream(socket.getInputStream());	
			@SuppressWarnings("unchecked")
			ArrayList<UserComment> cfile=(ArrayList<UserComment>)in.readObject();
		    //关闭流 
	    	out.close(); in.close(); 
	    	//关闭Socket 
		    socket.close();  
		    return cfile;
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	return null;
	    }
	}
}
