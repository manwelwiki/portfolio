document.addEventListener("DOMContentLoaded", () => {
  // Animate header text
  const header = document.querySelector("header h1");
  header.style.opacity = 0;
  let opacity = 0;

  const fadeIn = setInterval(() => {
    opacity += 0.02;
    header.style.opacity = opacity;
    if (opacity >= 1) clearInterval(fadeIn);
  }, 50);

  // Simple greeting in console
  console.log("Welcome to Manny's Portfolio 🚀");
});
