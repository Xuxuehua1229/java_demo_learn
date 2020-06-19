package com.baidu.ueditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.baidu.ueditor.define.ActionMap;

/**
 * 闁板秶鐤嗙粻锛勬倞閸ｏ拷
 * @author hancong03@baidu.com
 *
 */
public final class ConfigManager {

	private final String rootPath;
	private final String originalPath;
	private final String contextPath;
	private static final String configFileName = "config.json";
	private String parentPath = null;
	private JSONObject jsonConfig = null;
	// 濞戝倿鐢稉濠佺炊filename鐎规矮绠�
	private final static String SCRAWL_FILE_NAME = "scrawl";
	// 鏉╂粎鈻奸崶鍓у閹舵挸褰噁ilename鐎规矮绠�
	private final static String REMOTE_FILE_NAME = "remote";
	
	/*
	 * 闁俺绻冩稉锟芥稉顏嗙舶鐎规氨娈戠捄顖氱窞閺嬪嫬缂撴稉锟芥稉顏堝帳缂冾喚顓搁悶鍡楁珤閿涳拷 鐠囥儳顓搁悶鍡楁珤鐟曚焦鐪伴崷鏉挎絻鐠侯垰绶為幍锟介崷銊ф窗瑜版洑绗呰箛鍛淬�忕�涙ê婀猚onfig.properties閺傚洣娆�
	 */
	private ConfigManager ( String rootPath, String contextPath, String uri ) throws FileNotFoundException, IOException {
		
		rootPath = rootPath.replace( "\\", "/" );
		
		this.rootPath = rootPath;
		this.contextPath = contextPath;
		this.originalPath = "resource/config.json";
		
		/*if ( contextPath.length() > 0 ) {
			this.originalPath = this.rootPath + uri.substring( contextPath.length() );
		} else {
			this.originalPath = this.rootPath + uri;
		}*/
		
		this.initEnv();
		
	}
	
	/**
	 * 闁板秶鐤嗙粻锛勬倞閸ｃ劍鐎柅鐘蹭紣閸橈拷
	 * @param rootPath 閺堝秴濮熼崳銊︾壌鐠侯垰绶�
	 * @param contextPath 閺堝秴濮熼崳銊﹀閸︺劑銆嶉惄顔跨熅瀵帮拷
	 * @param uri 瑜版挸澧犵拋鍧楁６閻ㄥ増ri
	 * @return 闁板秶鐤嗙粻锛勬倞閸ｃ劌鐤勬笟瀣灗閼板崿ull
	 */
	public static ConfigManager getInstance ( String rootPath, String contextPath, String uri ) {
		try {
			return new ConfigManager(rootPath, contextPath, uri);
		} catch ( Exception e ) {
			return null;
		}
		
	}
	
	// 妤犲矁鐦夐柊宥囩枂閺傚洣娆㈤崝鐘烘祰閺勵垰鎯佸锝団��
	public boolean valid () {
		return this.jsonConfig != null;
	}
	
	public JSONObject getAllConfig () {
		
		return this.jsonConfig;
		
	}
	
	public Map<String, Object> getConfig ( int type ) {
		
		Map<String, Object> conf = new HashMap<String, Object>();
		String savePath = null;
		
		switch ( type ) {
		
			case ActionMap.UPLOAD_FILE:
				conf.put( "isBase64", "false" );
				conf.put( "maxSize", this.jsonConfig.getLong( "fileMaxSize" ) );
				conf.put( "allowFiles", this.getArray( "fileAllowFiles" ) );
				conf.put( "fieldName", this.jsonConfig.getString( "fileFieldName" ) );
				savePath = this.jsonConfig.getString( "filePathFormat" );
				break;
				
			case ActionMap.UPLOAD_IMAGE:
				conf.put( "isBase64", "false" );
				conf.put( "maxSize", this.jsonConfig.getLong( "imageMaxSize" ) );
				conf.put( "allowFiles", this.getArray( "imageAllowFiles" ) );
				conf.put( "fieldName", this.jsonConfig.getString( "imageFieldName" ) );
				savePath = this.jsonConfig.getString( "imagePathFormat" );
				break;
				
			case ActionMap.UPLOAD_VIDEO:
				conf.put( "maxSize", this.jsonConfig.getLong( "videoMaxSize" ) );
				conf.put( "allowFiles", this.getArray( "videoAllowFiles" ) );
				conf.put( "fieldName", this.jsonConfig.getString( "videoFieldName" ) );
				savePath = this.jsonConfig.getString( "videoPathFormat" );
				break;
				
			case ActionMap.UPLOAD_SCRAWL:
				conf.put( "filename", ConfigManager.SCRAWL_FILE_NAME );
				conf.put( "maxSize", this.jsonConfig.getLong( "scrawlMaxSize" ) );
				conf.put( "fieldName", this.jsonConfig.getString( "scrawlFieldName" ) );
				conf.put( "isBase64", "true" );
				savePath = this.jsonConfig.getString( "scrawlPathFormat" );
				break;
				
			case ActionMap.CATCH_IMAGE:
				conf.put( "filename", ConfigManager.REMOTE_FILE_NAME );
				conf.put( "filter", this.getArray( "catcherLocalDomain" ) );
				conf.put( "maxSize", this.jsonConfig.getLong( "catcherMaxSize" ) );
				conf.put( "allowFiles", this.getArray( "catcherAllowFiles" ) );
				conf.put( "fieldName", this.jsonConfig.getString( "catcherFieldName" ) + "[]" );
				savePath = this.jsonConfig.getString( "catcherPathFormat" );
				break;
				
			case ActionMap.LIST_IMAGE:
				conf.put( "allowFiles", this.getArray( "imageManagerAllowFiles" ) );
				conf.put( "dir", this.jsonConfig.getString( "imageManagerListPath" ) );
				conf.put( "count", this.jsonConfig.getInt( "imageManagerListSize" ) );
				break;
				
			case ActionMap.LIST_FILE:
				conf.put( "allowFiles", this.getArray( "fileManagerAllowFiles" ) );
				conf.put( "dir", this.jsonConfig.getString( "fileManagerListPath" ) );
				conf.put( "count", this.jsonConfig.getInt( "fileManagerListSize" ) );
				break;
				
		}
		
		conf.put( "savePath", savePath );
		conf.put( "rootPath", this.rootPath );
		
		return conf;
		
	}
	
	private void initEnv () throws FileNotFoundException, IOException {
		File file = null;
		if(this.originalPath != null && !"".equals(this.originalPath)) {
			file = new File(this.getClass().getResource("/").getPath()); 
			if(file.isDirectory()) {
				file = new File(file.getCanonicalPath() + "/" + this.originalPath);
				if(file.isFile()) {
					this.parentPath = file.getParent();
				}
			}
		}
		String configContent = this.readFile( this.getConfigPath() );
		try{
			JSONObject jsonConfig = new JSONObject( configContent );
			this.jsonConfig = jsonConfig;
		} catch ( Exception e ) {
			this.jsonConfig = null;
		}
		
	}
	
	private String getConfigPath () {
		return this.parentPath + File.separator + ConfigManager.configFileName;
	}

	private String[] getArray ( String key ) {
		
		JSONArray jsonArray = this.jsonConfig.getJSONArray( key );
		String[] result = new String[ jsonArray.length() ];
		
		for ( int i = 0, len = jsonArray.length(); i < len; i++ ) {
			result[i] = jsonArray.getString( i );
		}
		
		return result;
		
	}
	
	private String readFile ( String path ) throws IOException {
		
		StringBuilder builder = new StringBuilder();
		
		try {
			
			InputStreamReader reader = new InputStreamReader( new FileInputStream( path ), "UTF-8" );
			BufferedReader bfReader = new BufferedReader( reader );
			
			String tmpContent = null;
			
			while ( ( tmpContent = bfReader.readLine() ) != null ) {
				builder.append( tmpContent );
			}
			
			bfReader.close();
			
		} catch ( UnsupportedEncodingException e ) {
			// 韫囩晫鏆�
		}
		
		return this.filter( builder.toString() );
		
	}
	
	// 鏉╁洦鎶ゆ潏鎾冲弳鐎涙顑佹稉锟�, 閸撴棃娅庢径姘愁攽濞夈劑鍣存禒銉ュ挤閺囨寧宕查幒澶婂冀閺傛粍娼�
	private String filter ( String input ) {
		
		return input.replaceAll( "/\\*[\\s\\S]*?\\*/", "" );
		
	}

	@Override
	public String toString() {
		return "ConfigManager [rootPath=" + rootPath + ", originalPath=" + originalPath + ", contextPath=" + contextPath
				+ ", parentPath=" + parentPath + ", jsonConfig=" + jsonConfig + "]";
	}
	
}
