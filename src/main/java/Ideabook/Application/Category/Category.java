package Ideabook.Application.Category;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Category")
public class Category {
private String Id;
private String Name;
private String Description;
private String Image;

public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getImage() {
	return Image;
}
public void setImage(String image) {
	Image = image;
}

@Override
public String toString() {
	return "Category [Id=" + Id + ", Name=" + Name + ", Description=" + Description + ", Image=" + Image + "]";
}



}
