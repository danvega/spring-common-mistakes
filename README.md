# Spring Developer Common Mistakes

This is a repository of common mistakes we make as Spring Developers. 

[First 5 Common Mistakes](https://www.youtube.com/@danvega)

We did an episode based on this on The Spring Office Hours Podcast: 

[Spring Office Hours S3E4 - Common Spring Developer Mistakes](https://www.youtube.com/watch?v=nd5JzDIEI6A)

## 1. Making Everything Public 

When you get dropped into a Spring Boot project you have free rein to organize your project however you want. This is great because it allows you to put your code wherever you want. However, a lot of us (me included) follow a convention where we use a package by layer architecture. This causes code that is closely related to be split into different packages and therefore having to make everything public which is not how we would typically write code.

[Package by Layer vs Package by Feature](https://youtu.be/B1d95I7-zsw)

## 2 Field Injection

A common mistake is choosing field injection for Dependency Injection. There are a number of reasons that you should
favor constructor injection over field injection.

[Spring Constructor Injection: Why is it the recommended approach to Dependency Injection?](https://youtu.be/aX-bgylmprA)

## 3. Interface and Implementation when not necessary

There is a right place and a right time to create interfaces but in this common mistake we take a look at a time where it doesn't make a lot of sense. 

## 4. Proper REST API Design

Spring Boot gives you the tools to quickly and easily stand up a REST API. A common mistake I often see is creating REST resources with improper URIs. When you create a REST resource the request method should describe the intention, not the URI.

## 5. Improper Exception Handling

When a user expects a response and none is given that isn't a good experience. It's better to return something and in the case of asking for a resource by an invalid id it's often good practice to handle that exception. 