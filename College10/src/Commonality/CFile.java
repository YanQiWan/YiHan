package Commonality;

@SuppressWarnings("serial")
public class CFile implements java.io.Serializable{
	private String SourceName;
	private String Uploader;
	private String SourcePath;
	private int SourceId;
	private String UploadTime;
	private int SourceSize;
	public CFile(String Uploader,String SourceName,String SourcePath,int SourceId,String UploadTime,int SourceSize)
	{
		this.Uploader=Uploader;
		this.SourceName=SourceName;
		this.SourcePath=SourcePath;
		this.SourceId=SourceId;
		this.UploadTime=UploadTime;
		this.SourceSize=SourceSize;
	}
	public CFile() {}
	public int getSourceSize() {
		return SourceSize;
	}
	public void setSourceSize(int sourceSize) {
		SourceSize = sourceSize;
	}
	public String getSourceName() {
		return SourceName;
	}
	public void setSourceName(String sourceName) {
		SourceName = sourceName;
	}
	public String getUploader() {
		return Uploader;
	}
	public void setUploader(String uploader) {
		Uploader = uploader;
	}
	public String getSourcePath() {
		return SourcePath;
	}
	public void setSourcePath(String sourcePath) {
		SourcePath = sourcePath;
	}
	public int getSourceId() {
		return SourceId;
	}
	public void setSourceId(int sourceId) {
		SourceId = sourceId;
	}
	public String getUploadTime() {
		return UploadTime;
	}
	public void setUploadTime(String uploadTime) {
		UploadTime = uploadTime;
	}
	/*@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 * 读出值的过程
	 
	public static Parcelable.Creator<CFile> CREATOR=new Creator<CFile>() {
	//2.创建一个对象，一定要大写	
		@Override
		public CFile[] newArray(int size) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public CFile createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			CFile cfile=new CFile();
			cfile.setSourceId(source.readInt());
			cfile.setSourceName(source.readString());
			cfile.setSourcePath(source.readString());
			cfile.setSourceSize(source.readInt());
			cfile.setUploader(source.readString());
			cfile.setUploadTime(source.readString());
			return cfile;//3.读出值的过程，一定要返回obj2值
		}
	};
	
	 *4.写入值的过程
	 
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(Uploader);
		dest.writeString(SourceName);
		dest.writeString(SourcePath);
		dest.writeInt(SourceId);
		dest.writeString(UploadTime);
		dest.writeInt(SourceSize);
	}*/
};

