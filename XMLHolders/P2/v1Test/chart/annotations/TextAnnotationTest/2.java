@Test
    public void testSetRotationAnchor() {
        TextAnnotation a = new CategoryTextAnnotation("Test", "Category", 1.0);
        try {
            a.setRotationAnchor(null);
            fail("Should have thrown Exception.");
        } catch (IllegalArgumentException e) {
            // ok, exception is expected
        }
    }
 
    