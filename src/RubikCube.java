import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.media.j3d.*;

import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;

import javax.vecmath.*;

class Block{
	private BranchGroup[] last_Group = new  BranchGroup[6];
	private Shape3D[] quad3D = new Shape3D[6];
	private TransformGroup[] transformgroup_vector = new TransformGroup[6];
	private TransformGroup[] transformgroup = new TransformGroup[6];
	
	private Vector3f vector;
	private int tag;
	private int count = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	
	
	public void setRotationX(int x){
		Transform3D rotation_X= new Transform3D();
		if(x > 0){
			rotation_X.rotX((Math.PI / 2) * 1);
		}else{
			rotation_X.rotX((Math.PI / 2) * -1);
		}	
		for(int i = 0; i < last_Group.length; i++){
			BranchGroup lastGroup = last_Group[i];
			TransformGroup translast = transformgroup[i];
			lastGroup.detach();
			
			
			
			BranchGroup newBranch = new BranchGroup();
			
			newBranch.setCapability(BranchGroup.ALLOW_DETACH);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
			
			
			BranchGroup newBranch2 = new BranchGroup();
			newBranch2.setCapability(BranchGroup.ALLOW_DETACH);
			newBranch2.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
			newBranch2.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
		
			
			TransformGroup newGroup = new TransformGroup();	
			newGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
		
			newGroup.setTransform(rotation_X);
			newBranch.addChild(newGroup);
			
				newGroup.addChild(lastGroup);		
				translast.addChild(newBranch);
			
			transformgroup[i] = newGroup;
			}
	}

	
	public void setRotationY(int y){
		Transform3D rotation_Y= new Transform3D();
		if(y > 0){
			rotation_Y.rotY((Math.PI / 2) * 1);
		}else{
			rotation_Y.rotY((Math.PI / 2) * -1);
		}	
		for(int i = 0; i < last_Group.length; i++){
			BranchGroup lastGroup = last_Group[i];
			TransformGroup translast = transformgroup[i];
			lastGroup.detach();
			
			
			
			BranchGroup newBranch = new BranchGroup();
			
			newBranch.setCapability(BranchGroup.ALLOW_DETACH);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
			
			
			BranchGroup newBranch2 = new BranchGroup();
			newBranch2.setCapability(BranchGroup.ALLOW_DETACH);
			newBranch2.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
			newBranch2.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
		
			
			TransformGroup newGroup = new TransformGroup();	
			newGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
		
			newGroup.setTransform(rotation_Y);
			newBranch.addChild(newGroup);

				newGroup.addChild(lastGroup);		
				translast.addChild(newBranch);
			
			transformgroup[i] = newGroup;
			}
	}
	
	public void setRotationZ(int z){
		Transform3D rotation_Z= new Transform3D();
		if(z > 0){
			rotation_Z.rotZ((Math.PI / 2) * 1);
		}else{
			rotation_Z.rotZ((Math.PI / 2) * -1);
		}

		for(int i = 0; i < last_Group.length; i++){
			BranchGroup lastGroup = last_Group[i];
			TransformGroup translast = transformgroup[i];
			lastGroup.detach();
			
			
			
			BranchGroup newBranch = new BranchGroup();
			
			newBranch.setCapability(BranchGroup.ALLOW_DETACH);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
			newBranch.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
			
			
			BranchGroup newBranch2 = new BranchGroup();
			newBranch2.setCapability(BranchGroup.ALLOW_DETACH);
			newBranch2.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
			newBranch2.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
		
			
			TransformGroup newGroup = new TransformGroup();	
			newGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
			newGroup.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
		
			newGroup.setTransform(rotation_Z);
			newBranch.addChild(newGroup);
			
			
				newGroup.addChild(lastGroup);		
				translast.addChild(newBranch);
			
			transformgroup[i] = newGroup;
			}
	}
	public void addtransform_vector(TransformGroup transform){
		transformgroup_vector[count] = transform;
		count++;
	}
	public void addtransformGroup(TransformGroup transform){
		transformgroup[count4] = transform;
		count4++;
	}
	public void addQuad3D(Shape3D quad){
		quad3D[count3] = quad;
		count3++;
	}
	public void addLastGroup(BranchGroup lastGroup) {
		last_Group[count2] = lastGroup;
		count2++;
	}
	public Vector3f getVector() {
		return vector;
	}
	public void setVector(Vector3f vector) {
		this.vector = vector;
	}
	public void update(){
		for(int i = 0;i < transformgroup_vector.length; i++){
		
			TransformGroup translation_group = transformgroup_vector[i];
			Transform3D transform = new Transform3D();
			transform.setTranslation(vector);		
			translation_group.setTransform(transform);
			}
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
}

public class RubikCube extends JFrame implements KeyListener{
	static 	Block[][][] blocklist = new Block[3][3][3];
	static final String red = "red";
	static final String green = "green";
	static final String orange = "orange";
	static final String blue = "blue";
	static final String yellow= "yellow";
	static final String white= "white";
	static final String gray = "gray";
	static final String path = "./color/";

	public static void main(String[]args){
		//frame
		RubikCube frame = new RubikCube();
		frame.setResizable(false);
		frame.setBounds(100,100,600,600);
		frame.setTitle("Java3d");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.addKeyListener(frame);
		
		JPanel cp = new JPanel();
		cp.setLayout(null);
		frame.add(cp);
		
		//3Dcanvas
		GraphicsConfiguration g_config = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas = new Canvas3D(g_config);
		canvas.setBounds(0,0,frame.getWidth(),frame.getHeight());
		canvas.addKeyListener(frame);
		cp.add(canvas);
		
		//SimpleUniverse
		SimpleUniverse universe = new SimpleUniverse(canvas);

		BranchGroup group = new BranchGroup();
		
	    //BackGroundColor
	    BoundingSphere bounds2 = new BoundingSphere();
	    bounds2.setRadius(10.0);
	    Background bg = new Background( new Color3f( 0.4f, 0.6f, 0.8f ) );
	    bg.setApplicationBounds(bounds2);
	    group.addChild(bg);
	    universe.addBranchGraph(group);	
	    
		//Camera
		ViewingPlatform camera = universe.getViewingPlatform();
		camera.setNominalViewingTransform();
		TransformGroup view_transform_group = camera.getViewPlatformTransform();  
		Transform3D view_trans1 = new Transform3D();
		Vector3f view_vec = new Vector3f(0.0f,0.0f,20.0f);
		view_trans1.setTranslation(view_vec);
		
	     // マウスでぐりぐりするための処理
        OrbitBehavior orbit = new OrbitBehavior(canvas, OrbitBehavior.REVERSE_ALL);
        orbit.setSchedulingBounds(
            new BoundingSphere(new Point3d(0, 0, 0), 100.0));
        universe.getViewingPlatform().setViewPlatformBehavior(orbit);

		//view_trans2.rotX(-Math.PI/6);
		//view_trans1.mul(view_trans2);
		//view_trans2.rotY(-Math.PI/6);
		
		view_transform_group.setTransform(view_trans1);
		
		//light
		Color3f light_color = new Color3f(2.0f,2.0f,2.0f);
		Vector3f light_direction = new Vector3f(0.0f,-2.0f,-4.0f);
		DirectionalLight light = new DirectionalLight(light_color,light_direction);
		BoundingSphere bounds
		= new BoundingSphere( new Point3d( 0.0f , 0.0f , 0.0f ) , 1000); 
		light.setInfluencingBounds(bounds);
		BranchGroup group2 = new BranchGroup();
		group2.addChild(light);
		universe.addBranchGraph(group2);
		
		//Texture	
	    float length =1.0f;
    	Appearance image[] = new Appearance[6];
    	TextureLoader tloader[] = new TextureLoader[6];
    	QuadArray quadA[] = new QuadArray[6];
    	Shape3D quad3D[] = new Shape3D[6];
    	TransparencyAttributes trans[] = new TransparencyAttributes[6];
    			
    	Point3f[][] vertex = {
    		new Point3f[] {//up
    			new Point3f(-length,length,length),
    			new Point3f(length,length,length),
    			new Point3f(length,length,-length),
    			new Point3f(-length,length,-length)
    		},
    		new Point3f[]{//down
    			new Point3f(-length,-length,-length),
    			new Point3f(length,-length,-length),
    			new Point3f(length,-length,length),
    			new Point3f(-length,-length,length)
    		},
    		new Point3f[]{//front
    			new Point3f(-length,-length,length),
    			new Point3f(length,-length,length),
    			new Point3f(length,length,length),
    			new Point3f(-length,length,length)
    		},
    		new Point3f[]{//back
    			new Point3f(length,-length,-length),
    			new Point3f(-length,-length,-length),
    			new Point3f(-length,length,-length),
    			new Point3f(length,length,-length)
    		},
    		new Point3f[]{//right
    			new Point3f(length,-length,length),
    			new Point3f(length,-length,-length),
    			new Point3f(length,length,-length),
    			new Point3f(length,length,length)
    		},
    		new Point3f[]{//left
    			new Point3f(-length,-length,-length),
    			new Point3f(-length,-length,length),
    			new Point3f(-length,length,length),
    			new Point3f(-length,length,-length)
    		}
    	};

    	TexCoord2f[] texCoord ={
    		new TexCoord2f(0.0f,0.0f),
    		new TexCoord2f(1.0f,0.0f),
    		new TexCoord2f(1.0f,1.0f),
    		new TexCoord2f(0.0f,1.0f)
    	};
    			

    	String file[] = new String[6];
    	file[0]= path + white + ".png";
    	file[1]= path + orange + ".png";
    	file[2]= path + red + ".png";
    	file[3]= path + green + ".png";
    	file[4]= path + yellow + ".png";
    	file[5]= path + blue + ".png";
    			
    	for(int i = 0;i<6;i++){
    		image[i] = new Appearance();
    		tloader[i] = new TextureLoader( file[i],canvas );
    		Texture texture = tloader[i].getTexture();
    		image[i].setTexture( texture );
    		trans[i] = new TransparencyAttributes(
    			TransparencyAttributes.FASTEST,0.7f);
    		image[i].setTransparencyAttributes(trans[i]);
    	}
		BranchGroup group3 = new BranchGroup();

		//色情報[大きな面][x][y] //現在の色
		String[][][] colorlist = new String[6][3][3];	
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					switch(i){
					case 0:
						colorlist[i][j][k] = white;
					break;
					case 1:
						colorlist[i][j][k] = orange;
						break;
					case 2:
						colorlist[i][j][k] = red;
						break;
					case 3:
						colorlist[i][j][k] = green;
						break;
					case 4:
						colorlist[i][j][k] = yellow;
						break;
					case 5:
						colorlist[i][j][k] = blue;
						break;
					default:
						break;
					}
				}	
			}	
		}
		
		int num = 1;
		
		for(int j = 0; j< 3; j++){ //z軸
			for(int k = 0; k< 3; k++){ //y軸
				for(int l = 0; l< 3; l++){ //x軸
					Block block = new Block();
					block.setTag(num);
					num++;
			    	for(int i=0;i<6;i++){
			    		quadA[i]= new QuadArray(vertex[i].length,
			    		        GeometryArray.COORDINATES | 	
			    			GeometryArray.TEXTURE_COORDINATE_2);
			    		quadA[i].setCoordinates(0, vertex[i]);
			    		quadA[i].setTextureCoordinates(0, 0, texCoord);
			    		quad3D[i] = new Shape3D(quadA[i], image[i]);
			    	
			    		/*=============*/
//			    		Font font = new Font( "sansserif", Font.PLAIN,1);
//			    		Font3D font3d = new Font3D( font, new FontExtrusion()); 
//			    		Text3D text3d = new Text3D( font3d,"["+j+"]" ); 
//			    		quad3D[i].setGeometry(text3d); 
			    		/*=============*/
			    		
			    		Appearance appearance = new Appearance();
			    		appearance.setTexture(image[i].getTexture());
			    		quad3D[i].setAppearance(appearance);
			
			   		 //マウス操作用のノード
			        TransformGroup transG0 = new TransformGroup();
			        
			        group3.addChild(transG0);
			       
		    	   //座標変換の上書きを許可 
			        transG0.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			        //平行移動のためのベクトル生成。	   //x軸 y軸 z軸
			        Vector3f vector1 = new Vector3f(l*2,k*2,j*2);

			        TransformGroup translation_group = new TransformGroup();
					translation_group.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
					translation_group.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
					translation_group.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
					translation_group.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
					
					
					 BranchGroup blanch = new BranchGroup();
					 blanch.setCapability(BranchGroup.ALLOW_DETACH);
					 blanch.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
					 blanch.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
					 

					Transform3D transform = new Transform3D();
					block.setVector(new Vector3f(l*2,k*2,j*2));     
					transform.setTranslation(vector1);
					translation_group.setTransform(transform);
					block.addtransform_vector(translation_group);
					transG0.addChild(translation_group);
					translation_group.addChild(blanch);
					blanch.addChild(quad3D[i]);
					block.addtransformGroup(translation_group);
					block.addLastGroup(blanch);
					block.addQuad3D(quad3D[i]);
			    	}			 
			    	blocklist[l][k][j] = block;
			    }		
			}	
		}
    	universe.addBranchGraph(group3);	
        frame.setVisible(true);
   }

public static void verticalL(int z){
	   /*-------------------------水平方向左回転-------------------------*/
	int z2 = z;
	for(int i = 0; i < 3;i++){
		for(int j = 0; j < 3; j++){
			 blocklist[j][i][z2].setRotationZ(1);
			 blocklist[j][i][z2].update();
		}
	}

	
	/*
		Block escapelist2[][][] = new Block[3][3][3];
		int z2 = z;
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist2[i][2-j][z2] = blocklist[j][i][z2];
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				 blocklist[j][i][z2].setVector(escapelist2[i][2-j][z2].getVector());
				 blocklist[j][i][z2].setRotationZ(1);
				 blocklist[j][i][z2].update();
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist2[j][i][z2] = blocklist[i][2-j][z2];			
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[j][i][z2] = escapelist2[j][i][z2];		
			}
		}
		*/
 }
public static void verticalR(int z){
	for(int i = 0; i < 3;i++){
		for(int j = 0; j < 3; j++){
			blocklist[j][i][z].setRotationZ(- 1);
			blocklist[j][i][z].update();
		}
	}

    /*-------------------------水平方向右回転-------------------------*/
 	/*
	Block escapelist[][][] = new Block[3][3][3];
	
	for(int i = 0; i < 3;i++){
		for(int j = 0; j < 3; j++){
			escapelist[2-i][j][z] = blocklist[j][i][z];
		}
	}
	for(int i = 0; i < 3;i++){
		for(int j = 0; j < 3; j++){
			blocklist[j][i][z].setVector(escapelist[2-i][j][z].getVector());
			blocklist[j][i][z].setRotationZ(- 1);
			blocklist[j][i][z].update();
		}
	}
	for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist[j][i][z] = blocklist[i][2-j][z];			
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[j][i][z] = escapelist[j][i][z];		
			}
		}	
		*/
}

public static void tateL(int x){
	   /*-------------------------縦平方向左回転-------------------------*/
	int x2 = x;
	for(int i = 0; i < 3;i++){
		for(int j = 0; j < 3; j++){
			blocklist[x2][j][i].setRotationX(1);
			blocklist[x2][j][i].update();
		}
	}

	/*
	    Block escapelist6[][][] = new Block[3][3][3];
		
		int x2 = x;
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist6[x2][i][2-j] = blocklist[x2][j][i];
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[x2][j][i].setVector(escapelist6[x2][i][2-j].getVector());
				blocklist[x2][j][i].setRotationX(1);
				blocklist[x2][j][i].update();
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist6[x2][j][i] = blocklist[x2][2-i][j];			
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[x2][j][i] = escapelist6[x2][j][i];		
			}
		}	
		*/
}
public static void tateR(int x){
	   /*-------------------------縦方向右回転-------------------------*/
	for(int i = 0; i < 3;i++){
		for(int j = 0; j < 3; j++){
			blocklist[x][j][i].setRotationX(- 1);
			blocklist[x][j][i].update();
		}
	}

	/*
		Block escapelist5[][][] = new Block[3][3][3];
		
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist5[x][2-i][j] = blocklist[x][j][i];
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[x][j][i].setVector(escapelist5[x][2-i][j].getVector());
				blocklist[x][j][i].setRotationX(- 1);
				blocklist[x][j][i].update();
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				escapelist5[x][j][i] = blocklist[x][j][2-i];			
			}
		}
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[x][j][i] = escapelist5[x][j][i];		
			}
		}
		*/
}

public static void yokoL(int y){
    
/*------------------------横方向左回転-------------------------*/
	int y2 = y;
	for(int i = 0; i < 3;i++){
			for(int j = 0; j < 3; j++){
				blocklist[j][y2][i].setRotationY(-1);		
				blocklist[j][y2][i].update();
			}
		}

	/*
 		Block escapelist4[][][] = new Block[3][3][3];
 	     
 		int y2 = y;
 		for(int i = 0; i < 3;i++){
 			for(int j = 0; j < 3; j++){
 				escapelist4[2-i][y2][j] = blocklist[j][y2][i];			
 			}
 		}
 		for(int i = 0; i < 3;i++){
 			for(int j = 0; j < 3; j++){
 				blocklist[j][y2][i].setVector(escapelist4[2-i][y2][j].getVector());
 				blocklist[j][y2][i].setRotationY(-1);		
 				blocklist[j][y2][i].update();
 			}
 		}

 		for(int i = 0; i < 3;i++){
 			for(int j = 0; j < 3; j++){
 				escapelist4[j][y2][i] = blocklist[i][y2][2-j];			
 			}
 		}
 		for(int i = 0; i < 3;i++){
 			for(int j = 0; j < 3; j++){
 				blocklist[j][y2][i] = escapelist4[j][y2][i];		
 			}
 		}
 		*/
}
public static void yokoR(int y){
	   /*------------------------横方向右回転-------------------------*/
		for(int i = 0; i < 3;i++){
 			for(int j = 0; j < 3; j++){
 				blocklist[j][y][i].setRotationY(1);		
 				blocklist[j][y][i].update();
 			}
 		}

	/*
	 		Block escapelist3[][][] = new Block[3][3][3];
	 	     	for(int i = 0; i < 3;i++){
	 			for(int j = 0; j < 3; j++){
	 				escapelist3[i][y][2-j] = blocklist[j][y][i];			
	 			}
	 		}
	 		for(int i = 0; i < 3;i++){
	 			for(int j = 0; j < 3; j++){
	 				blocklist[j][y][i].setVector(escapelist3[i][y][2-j].getVector());
	 				blocklist[j][y][i].setRotationY(1);		
	 				blocklist[j][y][i].update();
	 			}
	 		}

	 		for(int i = 0; i < 3;i++){
	 			for(int j = 0; j < 3; j++){
	 				escapelist3[j][y][i] = blocklist[2-i][y][j];			
	 			}
	 		}
	 		for(int i = 0; i < 3;i++){
	 			for(int j = 0; j < 3; j++){
	 				blocklist[j][y][i] = escapelist3[j][y][i];		
	 			}
	 		}
	 		*/
}
public void output(){
	System.out.println("//=============================//");
	    for(int i = 0; i < 3; i++){
    	System.out.println("["+i+"]層");
    	 for(int j = 0; j < 3; j++){
    		 for(int k = 0; k < 3; k++){
    	        	System.out.print("[" + blocklist[k][j][i].getTag() + "]");
    	        }	
    		 	System.out.println();
         }	
    }
}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		//結論　実は移動していない！
		
		int text = arg0.getKeyCode();
		if(text == 81){
			tateL(0);
		}else if(text == 87){
			tateL(1);			
		}else if(text == 69){
			tateL(2);
		}else if(text == 65){
			tateR(0);
		}else if(text == 83){
			tateR(1);
		}else if(text == 68){
			tateR(2);
		}else if(text == 82){
			yokoL(0);
		}else if(text == 84){
			yokoL(1);			
		}else if(text == 89){
			yokoL(2);
		}else if(text == 70){
			yokoR(0);
		}else if(text == 71){
			yokoR(1);
		}else if(text == 72){
			yokoR(2);		
		}else if(text == 90){
			verticalL(0);
		}else if(text == 88){
			verticalL(1);				
		}else if(text == 67){		
			verticalL(2);
		}else if(text == 86){
			verticalR(0);
		}else if(text == 66){
			verticalR(1);
		}else if(text == 78){
			verticalR(2);
		}
	}

	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}