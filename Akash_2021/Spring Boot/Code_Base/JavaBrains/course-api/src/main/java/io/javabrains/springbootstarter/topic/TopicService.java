package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
					new Topic("Java", "Core Java", "Java Description"),
					new Topic("JavaScript", "JavaScript", "JavaScript Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int index = 0; index < topics.size(); index++) {
			if (topics.get(index).getId().equalsIgnoreCase(id)) {
				topics.set(index, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}