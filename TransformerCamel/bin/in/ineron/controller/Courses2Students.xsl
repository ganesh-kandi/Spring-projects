<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
  <xsl:output method="xml" indent="yes" />
<xsl:template match="/">

<students>
	<xsl:apply-templates/>
</students>
</xsl:template>
	<xsl:template match="">
	
	<student>
	<xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
	<firstName><xsl:value-of select="first"/></firstName>
	<firstName><xsl:value-of select="last"/></firstName>
	<firstName><xsl:value-of select="username"/></firstName>
	</student>
	
	</xsl:template>
	</xsl:stylesheet>