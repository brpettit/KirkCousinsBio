function shareOnTwitter() {
    const urlToShare = 'https://www.kirkandjuliefoundation.org'; // Provided URL
    const textToShare = "Check out the Kirk and Julie Foundation's website!"; // Adjusted message
    const twitterShareUrl = `https://twitter.com/intent/tweet?url=${encodeURIComponent(urlToShare)}&text=${encodeURIComponent(textToShare)}`;
    window.open(twitterShareUrl, 'Share on Twitter', 'width=600,height=400');
}
