public class Main {
    public static void main (String args[])
    {
        int count=0;
        String englishText = "How did you get started in AI? During my PhD in Statistical Physics, I explored how complex systems of many particles behave from a theoretical perspective. This is an intriguing field with many open questions, and it’s still very close to my heart. Nonetheless, after finishing my PhD, I wanted to work on more tangible problems where I can see the impact of my work. A mathematician I worked with connected me with his past student who was just starting an AI startup. It was a great opportunity to create a product from scratch in the quickly developing area of machine vision and NLP. After some exploration, I decided to join the founding team and lead the engineering aspects of the product. My background in applied math, as well as numerical analysis and coding from my Masters and PhD, made me a good candidate for the position. I also did some machine learning coding in CERN as a summer student. But I still had gaps in my machine learning knowledge, so I took a few courses on Coursera (Stanford’s Machine Learning course and Buffalo University’s Computer Vision Specialization) and explored scikit-learn models during the first few months at the startup. When I started working, deep learning was barely used outside of academia. It was only after a year at the startup that we began adopting deep learning .";
        String[] arr =englishText.split("\\W+");

        for (String mass: arr)
        {
            System.out.println(mass);
            count++;
        }
        System.out.println("Количество слов в тексте =" +  count);
    }
}
