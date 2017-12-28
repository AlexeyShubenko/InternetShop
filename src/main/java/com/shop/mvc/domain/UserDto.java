package com.shop.mvc.domain;

public class UserDto {

    private Long id;
    private String name;
    private String login;
    private String password;
    private Boolean isAdmin;

    public UserDto() {
    }

    public UserDto(String name, String login, String password, Boolean isAdmin) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public static class Builder{

        private UserDto userDto = new UserDto();

        public Builder setId(User user){
            userDto.setId(user.getId());
            return this;
        }

        public Builder setLogin(User user){
            userDto.setLogin(user.getLogin());
            return this;
        }

        public Builder setPassword(User user){
            userDto.setPassword(user.getPassword());
            return this;
        }

        public Builder setName(User user){
            userDto.setName(user.getName());
            return this;
        }

        public Builder setAdmin(User user){
            userDto.setAdmin(user.getAdmin());
            return this;
        }


        public UserDto build(){
            return userDto;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
