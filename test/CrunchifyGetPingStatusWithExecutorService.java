import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


 
public class CrunchifyGetPingStatusWithExecutorService {
	private static final int MYTHREADS = 10;
 
	public static void main(String args[]) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		//String[] hostList = {"http://localhost:8080/sample-webservice/crunchify/ftocservice"};
		String[] hostList = {"http://trinity-deluxe.codio.io:8080/springs-jersey-mongodb/beee/retrieveUser/?contactNumber=9550723467"};
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
 
			String url = hostList[0];
			Runnable worker = new MyRunnable(url);
			executor.execute(worker);
		}
		executor.shutdown();
		//executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
		
		//Wait until all threads are finish
		while (!executor.isTerminated()) {
 
		}
		System.out.println("Time taken: "+(System.currentTimeMillis()-startTime));
		//System.out.println("\nFinished all threads");
		//System.out.println(Counter.counter.size());
		Set<Entry<String, Long>> set = Counter.counter.entrySet();
		Iterator<Entry<String, Long>> hashMapIterator = set.iterator();
		long sumOfTime = 0L;
		while(hashMapIterator.hasNext()){
			sumOfTime += hashMapIterator.next().getValue();
		}
		System.out.println("Average time taken to serve all requests: "+(sumOfTime/Counter.counter.size())+" milli seconds.");
	}
	
 
	public static class MyRunnable implements Runnable {
		private final String url;
		
		MyRunnable(String url) {
			this.url = url;
		}
 
		@Override
		public void run() {
 
			String result = "";
			String responseData = "";
			int code = 200;
			try {
				URL siteURL = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) siteURL
						.openConnection();
				connection.setRequestMethod("GET");
				long startTime = System.currentTimeMillis();
				connection.connect();
				//int c = count.incrementAndGet();
				code = connection.getResponseCode();
				//System.out.println("Time taken to complete all the request: "+());
				Counter.counter.put(""+Counter.count.incrementAndGet(), new Long(System.currentTimeMillis()-startTime));
				//System.out.println(Counter.count.incrementAndGet()+" "+ new Long(System.currentTimeMillis()-startTime));
				/*BufferedReader reader  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder sb = new StringBuilder("");
				
				while(reader.ready()){
					sb.append(reader.readLine());
				}
				responseData = sb.toString();
				System.out.println(responseData);
				if (code == 200) {
					result = "Green\t";
				}*/
			} catch (Exception e) {
				result = "->Red<-\t";
			}
			//System.out.println(url + "\t\tStatus:" + result);
			//System.out.println(url + "\t\tResponse Data:" + responseData);
			//System.out.println(responseData);
		}
	}
	
	public static class Counter{
		public static ConcurrentHashMap<String,Long> counter = new ConcurrentHashMap<String, Long>();
		static AtomicInteger count = new AtomicInteger();
	}
}