package org.dejeong.demoweb.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class TodoEntity {

	private String id;
	private String userId;
	private String title;
	private boolean done;
}
