use strict;
use warnings;

my $file = 'app/src/main/kotlin/com/enna/music/lite/ui/screens/settings/AboutScreen.kt';
open my $fh, '<', $file or die;
my $content = do { local $/; <$fh> };
close $fh;

$content =~ s/val collaborators = emptyList<TeamMember>\(\)[\s\S]*?    \)/val collaborators = emptyList<TeamMember>()/gs;

open my $out, '>', $file or die;
print $out $content;
close $out;
