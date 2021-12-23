public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("This is my hello world start execution::");
		for(int i=0; i<=10; i++) {
			System.out.println("This is my hello world::" + i);
		}

	}

}

git init    --to initialize git
git status  -- to get get sit status
git add .   -- add files to git
git commit -m "added hello world"  -- commit files directorries to git
git remote add origin https://github.com/jaddhika/HelloWorld.git -- get github location and move to that location
git push -u origin master  -- push the files into github location
