/*package com.mapreduce.practice;

public class MaxMagResgion {
	
	public static class Map extends MapReduceBase implements
	Mapper<LongWritable, Text, Text, IntWritable> {

@Override
public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
		throws IOException {

	String line = value.toString();
	StringTokenizer tokenizer = new StringTokenizer(line);

	while (tokenizer.hasMoreTokens()) {
		value.set(tokenizer.nextToken());
		output.collect(value, new IntWritable(1));
	}

}
}

public static class Reduce extends MapReduceBase implements
	Reducer<Text, IntWritable, Text, IntWritable> {

@Override
public void reduce(Text key, Iterator<IntWritable> values,
		OutputCollector<Text, IntWritable> output, Reporter reporter)
		throws IOException {
	int sum = 0;
	while (values.hasNext()) {
		sum += values.next().get();
	}

	output.collect(key, new IntWritable(sum));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JobConf conf = new JobConf(WordCount.class);
		conf.setJobName("wordcount");

		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);

		conf.setMapperClass(Map.class);
		conf.setReducerClass(Reduce.class);

		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);

		FileInputFormat.setInputPaths(conf, new Path(args[0]));
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));

		JobClient.runJob(conf);

	}

}
*/


