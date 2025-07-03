const { test, expect } = require('@playwright/test');

test('Google search for Akansha', async ({ page }) => {
    await page.goto('https://www.google.com');

    // Try multiple possible consent buttons
    const consentButtons = [
        'button:has-text("Accept all")',
        'button:has-text("I agree")',
        'button:has-text("AGREE")',
    ];

    for (const selector of consentButtons) {
        const button = page.locator(selector);
        if (await button.isVisible({ timeout: 8000 })) {
            await button.click();
            break;
        }
    }

    // Now wait for the search box
    await page.waitForSelector('input[name="q"]', { timeout: 8000 });

    // Fill and search
    await page.fill('input[name="q"]', 'akansha');
    await page.press('input[name="q"]', 'Enter');

    // Validate search page loaded
    await expect(page).toHaveURL(/search/);
    await expect(page.locator('#search')).toBeVisible();
});

