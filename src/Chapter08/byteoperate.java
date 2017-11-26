//复制一张图片,永字节流操作

package Chapter08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteoperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("E:\\pictures\\捕获.JPG");
			fos=new FileOutputStream("E:\\pictures\\1my.jpg");
			byte[] buf=new byte[1024];//用字节流来复制
			int len=0;
			while((len=fis.read(buf))!=-1)
				fos.write(buf,0,len);
		}
		catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException("复制文件失败");
		}
		finally {
			try {
				if(fis!=null)
					fis.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("读取关闭失败");
			}
			try {
				if(fos!=null)
					fos.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("写入关闭失败");
			}
		}
	}

}
