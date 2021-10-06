@Test
    public void testChangeEvents() {
        TextAnnotation a = new CategoryTextAnnotation("Test", "A", 1.0);
        a.addChangeListener(this);
        this.lastEvent = null;
        a.setText("B");
        assertNotNull(this.lastEvent);
                this.lastEvent = null;
        a.setText("B");
        assertNotNull(this.lastEvent);
        
        this.lastEvent = null;
        a.setFont(new Font("SansSerif", Font.PLAIN, 12));
        assertNotNull(this.lastEvent);

        this.lastEvent = null;
        a.setPaint(Color.BLUE);
        assertNotNull(this.lastEvent);
        
        this.lastEvent = null;
        a.setTextAnchor(TextAnchor.CENTER_LEFT);
        assertNotNull(this.lastEvent);
        
        this.lastEvent = null;
        a.setRotationAnchor(TextAnchor.CENTER_LEFT);
        assertNotNull(this.lastEvent);

        this.lastEvent = null;
        a.setRotationAngle(123.4);
        assertNotNull(this.lastEvent);
   }

    